
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();  
      int b = sc.nextInt(); 
      String output = "n";
        
        for(int i = 0; i < a ; i++ ){
            if(output.equals("y")){
                break;
            }
            for(int j = 0; j < a ; j++){
                for(int k = 0; k < a ; k++){
                    if(10000 * i + 5000 * j + 1000 * k == b && i + j + k == a){
                        System.out.println(i+" "+j+" "+k);
                        output = "y";
                        break;
                    }
                }
            }
        }
    if(output.equals("n")){    
        System.out.println("-1 -1 -1" );    
    }    
  }    
}