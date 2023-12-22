import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String T;
		String TD;
		String W;
		String str;
		int j = 0;
		int i = 0;
		int k = 0;
		int count = 0;
		int same = 0;
		int flag = 0;
		int bre = 0;
	    char Tli[];
	    char Wli[];
	    
	    TD = "";
	    
	    W = as.nextLine();
	    
	    
	    
	    while(as.hasNext()){                  //EOF?????§??±????????????????????£?????????
            
            TD = TD + as.nextLine() + " "; 
             
        }
	    
	    //System.out.println(TD);
	    
	    Tli = new char[TD.length()];
	    Wli = new char[W.length()];
	    
	    TD = TD.toLowerCase();
	    W = W.toLowerCase();
	    
	    for(i=0;i<TD.length();i++){      //?????????????????????????????????????´???????
            
            Tli[i] = TD.charAt(i);
             
        }
	    
		for(i=0;i<W.length();i++){      //?????????????????????????????????????´???????
		    
			Wli[i] = W.charAt(i);
		     
		}
		
		
		    
		for(i=0;i<TD.length();i++){
			
			if(Tli[i] == ' '){
				
				bre++;
				//System.out.println(bre);
				
			}
			
		}
		
		for(i=0;i<bre;i++){
			
			/*System.out.println(Tli[j]+":test");
			System.out.println(j);
			System.out.println(W.length());
		*/
			while((Tli[j] != ' ') && k < W.length()){
			
				//System.out.println(Tli[j]+":"+Wli[k]);
				if(Tli[j] == Wli[k]){
		        	
					count++;
					
				}
				else{
					
					break;
				
				}
				
				j++;
				k++;
				
			}
			
			if(count == W.length()){
				
				same++;
				
			}
			
			while(Tli[j] != ' '){
				
				j++;
				
				if(count == W.length()){
					
					same--;
					
				}
				//System.out.println(j);
				
			}
			
			count = 0;
			k = 0;
			//System.out.println("!"+j);
			
			
			
			j++;
			
		}
		
		
		
			
			
        
		
		str = String.valueOf(same);
		System.out.println(str);

	}

}