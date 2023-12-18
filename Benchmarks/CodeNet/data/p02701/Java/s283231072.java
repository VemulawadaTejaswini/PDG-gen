import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner stdIn= new Scanner(System.in);

        int x = stdIn.nextInt();
        String[] a = new String[x];
        int s=0;
        for(int i=0;i<x;i++){
            a[i]=stdIn.next();
            for(int t=0;t<i;t++){
                if(a[t].equals(a[i]))break;
                if(i-1==t){
                    s++;
                }
            }
            if(i==0){
                s++;
            }
        }
        
        System.out.println(s);

    }
}
