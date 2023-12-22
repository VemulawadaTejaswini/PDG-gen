import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] arr;
        int n=0;
         
        while((str=br.readLine())!=null){
            if(n==0){
                n=Integer.parseInt(str);
                continue;
            }
            arr=str.split(" ");
            int m= arr.length;
            int[] array=new int[m];
 
            for(int i=1;i<=m;i++){
            	array[m-i] = Integer.parseInt(arr[m-i]);
                System.out.print(array[m-i]);
                if(i!=n) System.out.print(" ");
                
            }
            break;
        }
        br.close();
    }
}