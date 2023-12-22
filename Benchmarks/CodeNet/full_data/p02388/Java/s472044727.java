import java.io.IOException;
class Main{
    public static void main(String[] args){
    try{
        int x;
        x=System.in.read();
        System.out.println(x*x*x);
          }catch(IOException e){
          }
    }
}