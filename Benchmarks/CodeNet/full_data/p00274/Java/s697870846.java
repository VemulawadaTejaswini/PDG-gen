import java.util.Scanner;
class Main1{
 
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int syurui, stok;
        int hairetu[];
        int j = 0;
        syurui = sc.nextInt();
        hairetu = new int[syurui];
        
        for(int i = 0; i < syurui; i++){
			stok = sc.nextInt();
            hairetu[j] = stok;
            j += 1;
        }
		 
        if(stok == 0){
             System.out.print("N#A");
        }else if(syurui == 1){
                 System.out.print(2);
        }else{
              System.out.print(syurui+1);
        }
    }

		
    
    public static void main(String[] args){
        Main obj = new Main1();
        obj.solve();
    }