import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] order =br.readLine().split(" ");
        int a = Integer.parseInt(order[0]);
        int b = Integer.parseInt(order[1]);
        int c = Integer.parseInt(order[2]);
        
        int n1=0,n2=0,n3=0;
        if(a<b){n1=b;n2=a;}else{n1=a;n2=b;}
        if(n1<c){n3=n1;n1=c;}else{n3=c;}
        if(n2<n3){System.out.println(n2+" "+n3+" "+n1);
        }else{System.out.println(n3+" "+n2+" "+n1);}
        
    }
    
}