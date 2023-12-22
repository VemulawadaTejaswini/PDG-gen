import java.util.*;
class Main{
public static void main(String[] args) {
  Scanner reader =new Scanner (System.in);
  String s=reader.next();

  int count=0;
  for(int i=0;i<s.length()-3;i++)
  {
    for(int k=3+i;k<=s.length();k++)
    {

      if(Long.parseLong(s.substring(i,k))%2019==0)
      {
          System.out.println(s.substring(i,k));
            count++;


    }
  }






}
System.out.println(count);
}

}