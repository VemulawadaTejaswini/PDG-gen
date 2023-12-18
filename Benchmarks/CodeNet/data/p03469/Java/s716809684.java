public class Main{
  public static void main(String[] args) throws Exception{
    char[] kari=new char[10];
    for(int i=0;i<10;i++) kari[i]=(char)System.in.read();
    kari[3]='8';
    for(int i=0;i<10;i++) System.out.print(kari[i]);
    System.out.print("\n");
  }
}