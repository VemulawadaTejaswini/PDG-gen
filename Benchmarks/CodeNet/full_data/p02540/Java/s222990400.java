import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] town= new int[n][2];
        for(int i=0;i<n;i++){
            town[i][0]=sc.nextInt();
            town[i][1]=sc.nextInt();
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if((town[i][0]==town[j][0] && town[i][1]==town[j][1]) || (town[i][0]>town[j][0] && town[i][1]>town[j][1]) || (town[i][0]<town[j][0] && town[i][1]<town[j][1]))
                count++;
            }
            result.add(count);
        }
        for(int c:result)
        System.out.println(c);
    }

}
