import java.io.* ;

public class Main {
    public static void main(String[] args){
         
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String buf = br.readLine();
            StringTokenizer st=new StringTokenizer(buf," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
 
            if(a < b)
                System.out.println("a < b");
            else if(a > b)
                System.out.println("a > b");
            else if(a == b)
                System.out.println("a == b");
 
        } catch(IOException e) {
            System.err.println(e);
        }
    }
}