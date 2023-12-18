public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    int result = 700;
    
    char[] unko = s.toCharArray();
    
    for(int i=0;i<unko.length;i++){
      if(unko[i]=='o'){
        result += 100;
      }
    }
    
    System.out.println(result);
  
  }
  
}