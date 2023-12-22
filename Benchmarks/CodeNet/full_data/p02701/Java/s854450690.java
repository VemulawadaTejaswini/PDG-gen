import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner stdIn= new Scanner(System.in);

        int x = stdIn.nextInt();
        String[] a = new String[x];
        String[] syu = new String[x];
        int s=0;
        for(int i=0;i<x;i++){
            a[i]=stdIn.next();
            if(i==0){
                syu[0]=a[0];
                s++;
            }else{
                for(int t=0;t<s;t++){
                    if(a[i].equals(syu[t])){
                        break;
                    }
                    if(t==s-1){
                        syu[s]=a[i];
                        s++;
                    }
                }
            }
        }
        
        System.out.println(s);

    }
}