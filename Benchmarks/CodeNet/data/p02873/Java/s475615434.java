import java.util.*;
public class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
 List<Character> l=new ArrayList<>();
  String str=s.nextLine();
  for(int i=0;i<str.length();i++){
  l.add(str.charAt(i));
  }
 int cnt=0;
  int tmp=0;
  for(int i=0;i<str.length();i++){
  if(l.get(i)=='<'){
    tmp++;
    cnt+=tmp;
  }
    if(l.get(i)=='>'){
      tmp--;
    cnt+=tmp;
    }
    if(tmp<0)
      cnt+=str.length();
  }
  System.out.print(cnt);
}
}