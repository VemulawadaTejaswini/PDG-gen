import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {


	public void readInput() throws Exception {
 		  
 			//0 3 3 0 0 0 1 1 0 2 2 0 
 		//BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
 		//BufferedReader buf = new BufferedReader(new FileReader("input.txt"));         
        int N = input.nextInt();
        int j=0;;
        for(int i=0;i<N;i++){
             j = j*10+input.nextInt();
        }
        String P  = String.valueOf(j);
        j=0;;
        for(int i=0;i<N;i++){
             j = j*10+input.nextInt();
        }
        String Q  = String.valueOf(j);
        //System.out.println("P: "+P+" Q: "+Q);
        find(N,P,Q);
          
    }

    private void find(int N, String P, String Q) {
        int r1 = findRank(P, N);        
        int r2 = findRank(Q, N);
        //System.out.println("r1: "+r1+" r2: "+r2);
        System.out.println(Math.abs(r1-r2));
    }
    private int factorial(int N) {
        if(N<=1) return 1;
        return N*factorial(N-1);
    }

    private int findRank(String S, int N) {
        int mul  = factorial(N);
        int rank=1, countRight=0;
        for(int i=0;i<S.length();i++) {
            mul/=S.length()-i;
            countRight = findSmallerInRight(S,i,S.length()-1);
            rank += countRight*mul;
        }
        return rank;
    }

    private int findSmallerInRight(String S, int lo, int hi) {
        int countRight=0;
        for(int i=lo+1;i<=hi;i++) {
            int c1 = S.charAt(lo)-'0';
            int c2 = S.charAt(i)-'0';
            if (c1<c2) countRight++;
        }
        return countRight;
    }

    private int maxHops(int i, int []array) {
        if(i==array.length) return 1;
        int count=1;
        if(i+1<array.length && array[i+1]<=array[i]) {
            count += maxHops(i+1, array);
        }
        return count;
    }

    private void print(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    private void print(int []array) {
        System.out.println(Arrays.toString(array));
    }
  
   

    private static void swap(char []array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 

	public static void main(String[] args) throws Exception {
		Main ans = new Main();
		ans.readInput(); 
        out.close();
		//shouldReturn10();
		
	}


    private static InputStream inputStream = System.in;
    private static InputReader input = new InputReader(inputStream);
    private static OutputStream outputStream = System.out;
    private static PrintWriter out = new PrintWriter(outputStream);
	 
    static class InputReader {
        private BufferedReader buf;
        private StringTokenizer token;
        public InputReader(InputStream inputStream){
            buf = new BufferedReader(new InputStreamReader(inputStream),32768);
            token = null;
        }
        
        private String next(){
            while(token==null || !token.hasMoreTokens()){
                try{
                    token = new StringTokenizer(buf.readLine());
                }catch(Exception e){
                    throw new RuntimeException("Error in reading input",e);
                }
            }
            return token.nextToken();
        }
        
        public int nextInt(){
            return Integer.parseInt(next());
        }

        public String nextString(){
            return next();
        }

        public long nextLong(){
            return Long.parseLong(next());
        }
    }
}

class XCoordinateComparator implements Comparator<Point>{

    public int compare(Point p1, Point p2){
        if (p1.x == p2.x) return p1.y - p2.y;
        return p1.x-p2.x;
    }

}
class YCoordinateComparator implements Comparator<Point>{

    public int compare(Point p1, Point p2){
        if (p1.y == p2.y) return p1.x - p2.x;
        return p1.y-p2.y;
    }

}
class Point{
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }

    public int hashCode(){
        String s = x+""+y;
        return s.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        Point p = (Point) obj;         
        return this.x == p.x && this.y == p.y;
    }
}
class DNode{
    int val;
    int index;
    DNode next,prev;
    public DNode(int val, int index){
        this.val = val;
        this.index = index;
    }
    public boolean equals(Object o){
        if (!(o instanceof DNode)){
            return false;
        }
        DNode other = (DNode)o;
        return (other.val==this.val) && (other.index == this.index);

    }

    public String toString() {
        return this.index + " -> " + this.val;
    }
}
class DList{

    DNode tail,head;
    int count;

    public DList() {
        tail = new DNode(-1,-1);         
        head = new DNode(-2,-2);
        head.next = tail;
        head.prev = tail;
        tail.prev = head;
        tail.next = head;
        count =0;
    }
    public void add(int val, int index){
        DNode curr = new DNode(val, index);
        count++;
        addNode(curr);
    }
    public void addLast(int val, int index){
        DNode curr = new DNode(val, index);
        count++;
        addLast(curr);
    }

    private void addNode(DNode curr) {
        DNode temp = head.next;
        head.next = curr;
        curr.prev = head;

        curr.next = temp;
        temp.prev = curr;
    }

    private void addLast(DNode curr) {
        DNode temp = tail.prev;
        tail.prev = curr;
        curr.next = tail;

        curr.prev = temp;
        temp.next = curr;
    }

    public boolean hasNext(){
        return !head.next.equals(tail);
    }
    public DNode remove() {
        count--;
        DNode temp = head.next;
        DNode nextNode = temp.next;
        head.next = nextNode;
        nextNode.prev = head;
        return temp;
    }
    
    public int size(){
        return count;
    }

    public void printNodes() {
        DNode curr = head.next;
        while(!curr.equals(tail)){
            System.out.println(curr);
            //System.out.print("->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }


}