import java.io.* 
class Main {
   public static void main(String[] args){
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String buf = br.readLine();
     int x = Integer.parseInt(buf);
     System.out.println(x * x * x);
  }
}
