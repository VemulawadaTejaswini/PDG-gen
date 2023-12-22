import java.io.*;

public class Main{

    static boolean binarySearch(int[] s, int n, int key){
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(s[mid] == key){
                return true;
            }else if(s[mid] < key){
                left = mid + 1;
            }else if(key < s[mid]){
                right = mid - 1;
            }
        }

        return false;
    }
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
        int n = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        int[] s = new int[n];
        for(int i = 0; i < n; i++)
            s[i] = Integer.parseInt(str1[i]);

        int q = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");
        int[] t = new int[q];
        for(int i = 0; i < q; i++)
            t[i] = Integer.parseInt(str2[i]);

        int count = 0;
        for(int i = 0; i < q; i++)
            if(binarySearch(s, n, t[i]))
                count++;

        System.out.println(count);        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
