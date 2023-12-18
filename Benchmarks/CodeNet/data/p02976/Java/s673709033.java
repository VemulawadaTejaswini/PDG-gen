import java.util.Scanner;
import java.util.ArrayList;

class Main{
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodeNum = sc.nextInt();
        int edgeNum = sc.nextInt();
        if(edgeNum % 2 == 1){
            System.out.println(-1);
        }

        for(int i = 0; i <= nodeNum; i++){
            edges.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < edgeNum; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            edges.get(start).add(end);
            edges.get(end).add(start);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= nodeNum; i++){
            int connect = edges.get(i).size();
            connect = 2 * (int)(connect/2);
            for(int j = 0; j < connect; j++){
                int end = edges.get(i).get(j);
                int index = edges.get(end).indexOf(i);
                edges.get(end).remove(index);
                //sb更新
                sb.append(i);
                sb.append(" ");
                sb.append(end);
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }

}