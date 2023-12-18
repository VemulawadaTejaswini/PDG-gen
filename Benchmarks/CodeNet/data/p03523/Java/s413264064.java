import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next(),test="";
    char[] ch=s.toCharArray();
    int n=9;
    if(s.length()>n){
      System.out.println("NO");
    }else if(s.length()==n){
      if(s.equals("AKIHABARA")){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }else{
      for(int i=0;i<ch.length;i++){
        if(i==0){
          if(ch[i]=='K'){
            test+="A"+ch[i];
            
          }else{
            test+=ch[i];
          }
        }else if(i==ch.length-1){
          if(ch[i]=='A'){
            test+=ch[i];
          }else{
            test+=(ch[i]+"A");
          }
        }else{
          if(ch[i]=='K'){
            if(ch[i-1]=='A'){
              test+=ch[i];
            }else{
              test+=("A"+ch[i]);
            }
          }else if(ch[i]=='H'){
            if(ch[i+1]=='A'){
              test+=ch[i];
            }else{
              test+=(ch[i]+"A");
            }
          }else if(ch[i]=='B'){
            if(ch[i+1]=='A'){
              test+=ch[i];
            }else{
              test+=(ch[i]+"A");
            }
          }else if(ch[i]=='R'){
            if(ch[i+1]=='A'){
              test+=ch[i];
            }else{
              test+=(ch[i]+"A");
            }
          }else{
            test+=ch[i];
          }
        }
      }
      if(test.equals("AKIHABARA")){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}
