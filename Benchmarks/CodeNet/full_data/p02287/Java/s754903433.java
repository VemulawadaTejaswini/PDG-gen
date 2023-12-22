import java.util.*;
import java.io.*;

public class Main{
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] sElementArray=sc.nextLine().split(" ");
        //int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        int[] array=new int[n+1];
        for(int i=0;i<n;i++){
            array[i+1]=Integer.parseInt(sElementArray[i]);
        }
        sc.close();

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    try{
        //         int n= Integer.parseInt(br.readLine());
        //         int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
                
        //     }catch(IOException e){e.printStackTrace();}

        StringBuilder sb= new StringBuilder();
        
        for(int i=1;i<=n;i++){
            sb.append("node "+i+": ");
            sb.append("key = "+array[i]+", ");
            if(parent(i)>=1) sb.append("parent key = "+array[parent(i)]+", ");
            if(left(i)<=n) sb.append("left key = "+array[left(i)]+", ");
            if(right(i)<=n) sb.append("right key = "+array[right(i)]+", ");
            sb.append("\n");
        }
        System.out.print(sb);
    }
    
    //return index of each node
    static int parent(int h){return h/2;}
    static int left(int h){return 2*h;}
    static int right(int h){return 2*h+1;}
}
    
