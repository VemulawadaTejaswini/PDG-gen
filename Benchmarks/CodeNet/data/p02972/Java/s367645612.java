import java.io.*;
class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb1 = br.readLine();
        String sb2 = br.readLine();
        String[] l = sb2.split(" ");
        int[] a = new int[l.length];
        int[] z = new int[a.length];
        int count = 0;
        for(int i = 0;i < a.length;i++){
            a[i] = Integer.parseInt(l[i]);
            if(a[i] == 1){   
                count++;
            }
            if(i > 0){
                int count2 = 0;
                for(int b = i;b < a.length;b = b + i + 1){
                    if(a[i] == 1){   
                        count2++;
                    }
                }
                if((count2 % 2) == 1){
                    z[i] = 1;
                }
            }
        }
        if((count % 2) == 1){
            z[0] = 1;
        }
        for(int i = 0;i < z.length;i++){
            if(z[i] == 1){
                System.out.print((i + 1) + " ");
            }
        }

    }
}