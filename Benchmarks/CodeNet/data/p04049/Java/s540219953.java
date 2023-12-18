import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main
{
    private static class Edge
    {
        Vertex from, to;
        long fromDepth, toDepth;
        long fromCost, toCost;
 
        public Edge(Vertex from, Vertex to)
        {
            this.from = from;
            this.to = to;
            this.from.edges.add(this);
            this.to.edges.add(this);
        }
 
        void setFrom(Vertex newFrom)
        {
            // Swap if needed
            if (newFrom == to)
            {
                Vertex tmp = this.from;
                this.from = to;
                to = tmp;
            }
            else if (newFrom != from)
                throw new RuntimeException("Abracadabra froms do not agree");
        }
    }
 
    private static class GraphTraversalData
    {
        final long maxDepthFromThisVertex, maxCostFromThisVertex;
 
        GraphTraversalData(long maxDepthFromThisVertex, long maxCostFromThisVertex)
        {
            this.maxDepthFromThisVertex = maxDepthFromThisVertex;
            this.maxCostFromThisVertex = maxCostFromThisVertex;
        }
    }
 
    private static class Vertex
    {
        final long vindex;
        List<Edge> edges = new ArrayList<Edge>();
 
        Vertex(long vindex)
        {
            this.vindex = vindex;
        }
 
        public String toString()
        {
            return Long.toString(vindex);
        }
 
        public void populateData()
        {
            // First pass to figure out the out/to direction
            for (Edge edge : edges)
            {
                edge.setFrom(this);
                edge.to.traverseGraphAndSetToData(edge);
            }
 
            // Second pass to figure out the in/from direction
            traverseGraphAndSetFromData(null);
        }
 
        void traverseGraphAndSetFromData(Edge arrivedVia)
        {
            long totalCostViaOtherEdges, maxDViaOtherEdges;
 
            for (Edge edge : edges)
            {
                if (edge != arrivedVia)
                {
                    totalCostViaOtherEdges = 0;
                    maxDViaOtherEdges = 0;
                    for (Edge tmpEdge : edges)
                    {
                        if (tmpEdge != edge && tmpEdge != arrivedVia)
                        {
                            totalCostViaOtherEdges += tmpEdge.toCost;
                            maxDViaOtherEdges = Math.max(maxDViaOtherEdges, tmpEdge.toDepth);
                        }
                    }
 
                    if (arrivedVia != null)
                    {
                        totalCostViaOtherEdges += arrivedVia.fromCost;
                        maxDViaOtherEdges = Math.max(maxDViaOtherEdges, arrivedVia.fromDepth);
                    }
 
                    edge.fromCost = totalCostViaOtherEdges + 1;
                    edge.fromDepth = maxDViaOtherEdges + 1;
 
                    edge.to.traverseGraphAndSetFromData(edge);
                }
            }
        }
 
        private GraphTraversalData traverseGraphAndSetToData(Edge arrivedVia)
        {
            long maxDepthFromThisVertex = 0;
            long maxCostFromThisVertex = 1;
            for (Edge edge : edges)
            {
                if (edge != arrivedVia)
                {
                    edge.setFrom(this);
                    GraphTraversalData graphTraversalData = edge.to.traverseGraphAndSetToData(edge);
                    maxCostFromThisVertex += graphTraversalData.maxCostFromThisVertex;
                    maxDepthFromThisVertex = Math.max(maxDepthFromThisVertex, graphTraversalData.maxDepthFromThisVertex);
                }
            }
 
            arrivedVia.toDepth = maxDepthFromThisVertex + 1;
            arrivedVia.toCost = maxCostFromThisVertex;
            return new GraphTraversalData(arrivedVia.toDepth, maxCostFromThisVertex);
        }
    }
 
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d = sc.nextInt();
      String sampleInput = n + " " +d +"\n";
      for (int i = 0; i<n-1;i++){
        String a = sc.next();
        String b= sc.next();
        sampleInput = sampleInput + a+" "+b+"\n";
      }
        solve(sampleInput, false);
    }
 
    private static int solve(String input, boolean testMode)
    {
        String[] lines = input.split("\n");
        String[] NandK = lines[0].split(" ");
        //System.out.println("N is " + NandK[0] + ", K is " + NandK[1]);
 
        long N = Long.parseLong(NandK[0]);
        long K = Long.parseLong(NandK[1]);
 
        Map<Long, Vertex> vertices = new HashMap<Long, Vertex>();
        List<Edge> edges = new ArrayList<Edge>();
        for (int i = 1; i < N; i++)
        {
            String[] edgeInfo = lines[i].split(" ");
            long fromVindex = Long.parseLong(edgeInfo[0]);
            long toVindex = Long.parseLong(edgeInfo[1]);
 
            if (!vertices.containsKey(fromVindex))
                vertices.put(fromVindex, new Vertex(fromVindex));
 
            if (!vertices.containsKey(toVindex))
                vertices.put(toVindex, new Vertex(toVindex));
 
            Vertex fromVertex = vertices.get(fromVindex);
            Vertex toVertex = vertices.get(toVindex);
 
            edges.add(new Edge(fromVertex, toVertex));
        }
 
        if (testMode)
        {
            for (Vertex vertex : vertices.values())
            {
                vertex.populateData();
 
                long result = solveForK(edges, K);
                System.out.println("Result is " + result);
            }
        }
        else
        {
            Vertex vertex = vertices.values().iterator().next();
            vertex.populateData();
 
            long result = solveForK(edges, K);
            if (N < 2000)
                throw new RuntimeException("test");
            System.out.println(result);
            
        }
 
        return 0;
    }
 
    static long solveForK(List<Edge> edges, long K)
    {
        long minRemovedVertices = Long.MAX_VALUE;
        for (Edge edge : edges)
        {
            if (edge.fromDepth <= K)
                minRemovedVertices = Math.min(minRemovedVertices, edge.toCost - 1);
            if (edge.toDepth <= K)
                minRemovedVertices = Math.min(minRemovedVertices, edge.fromCost - 1);
        }
 
        return minRemovedVertices == Long.MAX_VALUE ? 0 : minRemovedVertices;
    }
}