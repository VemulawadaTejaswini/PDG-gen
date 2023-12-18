import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean isReverse = false;//反転中フラグ
    String s = sc.next();
    StringBuilder sb = new StringBuilder(s);
    int Q = sc.nextInt();
    
    for(int i = 0;i<Q;i++){
      if(sc.nextInt()==1){
        isReverse = !isReverse;
      }else{
        sb = build(sb,isReverse,sc.nextInt(),sc.next());
      }
    }
    
    if(!isReverse){
    System.out.println(sb);
    }else{
     System.out.println(sb.reverse());
    }
  }
  
  public static StringBuilder build(StringBuilder buff , boolean isReverse,int F , String C){
    if(isReverse&&F==1){
      buff.append(C);
    }else if(isReverse&&F==2){
      buff.insert(0,C);
    }else if(!isReverse&&F==1){
      buff.insert(0,C);
    }else{
      buff.append(C);
    }
    return buff;
  }
      
  

  
}
