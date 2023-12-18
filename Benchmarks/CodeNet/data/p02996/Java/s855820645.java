import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] array = new int[n][2];
        for(int i=0;i<n;i++){
            array[i][1] = in.nextInt();
            array[i][0] = in.nextInt();
        }
        Arrays.sort(array, (a,b) -> Integer.compare(a[0],b[0]));
        int time=0,flag=0;
        for(int i=0;i<n;i++){
            time+=array[i][1];
            if(time>array[i][0]){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}