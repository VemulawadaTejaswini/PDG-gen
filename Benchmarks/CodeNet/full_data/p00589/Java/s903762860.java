import java.io.*;
public class Main {
 public static void main(String[] args){
  try{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   char botton[][]={{' '},
                            {'\'' , ',' , '.' , '!' , '?'},
                            {'a' , 'b' , 'c' , 'A' , 'B' , 'C'},
                            {'d' , 'e' , 'f' , 'D' , 'E' , 'F'},
                            {'g' , 'h' , 'i' , 'G' , 'H' , 'I'},
                            {'j' , 'k' , 'l' , 'J' , 'K' , 'L'},
                            {'m' , 'n' , 'o' , 'M' , 'N' , 'O'},
                            {'p' , 'q' , 'r', 's' , 'P' , 'Q' , 'R' , 'S'},
                            {'t' , 'u' , 'v' , 'T' , 'U' , 'V'},
                            {'w' , 'x' , 'y' , 'z' , 'W' , 'X' , 'Y' , 'Z'}};
    int n[]={0,5,6,6,6,6,6,8,6,8};
    while(true){
     String s=br.readLine();
     s+="x";
     char x,ch;
     int num,l,a;
     int sl=s.length();
     int cnt=0,cnt0=0;
     if(s.charAt(0)=='0')cnt0++;
     else cnt++;

     for(int i=1;i<sl;i++){
      if(s.charAt(i-1)!=s.charAt(i)){
       x=s.charAt(i-1);
       if(x!='0'){
        num=Character.getNumericValue(x);
        l=n[num];
        if(cnt%l==0)a=6;
        else a=cnt%l;
        ch=botton[num][a-1];
        System.out.print(ch);
       }
       else if(x=='0' && cnt0!=1)for(int j=0;j<cnt0-1;j++)System.out.print(" ");
       cnt=0;cnt0=0;
       if(s.charAt(i)=='0')cnt0++;
       else cnt++;
      }
      else {
        if(s.charAt(i)=='0')cnt0++;
        else cnt++;
      }
     }
     System.out.print("\n");
   }
  }
  catch(Exception e){return ;}
 }
}
