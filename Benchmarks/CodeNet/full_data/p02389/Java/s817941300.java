import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
 public static void main (String[] args) throws java.lang.Exception
 {
 InputStreamReader is = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(is);
 int tate = Integer.parseInt(br.readLine());
 int yoko = Integer.parseInt(br.readLine());
 int menseki = tate * yoko;
 int nagasa = tate * 2 + yoko * 2;
 System.out.println(menseki+" "+ nagasa);
 }
}
