import java.io.IOException;
class Main{
    public static void main(String[] args){
    try{
int x;
while((x=System.in.read())  != -1)
  System.out.println(x*x*x);
          }catch(IOException e){
          }
    }
}