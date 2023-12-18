import java.util.*;

class Main{

  public static void main(String args[]){
  	Scanner sc=new Scanner(System.in);
    
    int[] data=new int[4];
    
    for(int i=0;i<4;i++){
    	data[i]=sc.nextInt();
    }
    
    //直接会話できる？
    String result="";
    if(data[0]+data[3]>=data[2]){
    	result="Yes";
    }else if(data[0]+data[3]>=data[1] && data[1]+data[3]>=data[2]){
    	result="Yes";
    }else{
    	result="No";
    }
    
    System.out.println(result);
    
  }

}