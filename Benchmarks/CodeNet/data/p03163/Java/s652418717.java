import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static int lis(int[]arr){
    int[] count=new int [arr.length];
        int[] count2=new int [arr.length];
    int max=0;
    for(int x=0;x<arr.length;x++){
        count[x]=1;
        count2[x]=1;
    }
    for(int i = arr.length-2 ;i>=0;i--){
            for (int j =arr.length-1; j >i; j--) {
                if (arr[i] > arr[j]&& count[i] < count[j] + 1) {
                    count[i] = count[j]+1;
                }
                if (arr[i] < arr[j]&& count2[i] < count2[j] + 1) {
                    count2[i] = count2[j]+1;
                }
                max=Math.max(max,count2[i]+count[i]-1);
        }
    }

   /* for(int z = 0;z<count.length;z++){
        out.print((count[z])+",");
    }
    out.println();
    for(int z = 0;z<count2.length;z++){
            out.print((count2[z])+",");
        }
        out.println();
    out.flush();*/
    return max;
    }
    public static void main(String[] args)throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycles = Integer.parseInt(br.readLine());
     //   int[] arr2= {5,4,3,2,1,6,7,8};
        for(int i =0;i<cycles;i++) {
            int[] arr = new int[Integer.parseInt(br.readLine())];
            for(int j =0;j<arr.length;j++){
                arr[j] = Integer.parseInt(br.readLine());
            }
            out.println(lis(arr));
        }
        out.flush();
    }
}