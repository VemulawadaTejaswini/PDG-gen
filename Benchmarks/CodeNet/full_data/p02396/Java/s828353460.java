import java.io.IOException;

class Main{
    public static void main(String[] a) throws IOException{
    	int c, no=0;
      while ((c = System.in.read()) > 0){
      	no++;
        System.out.println("Case " + no + ": " + c + "\n");
      }
    }
}