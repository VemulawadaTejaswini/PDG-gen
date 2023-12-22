import java.util.Scanner;

class Main{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	while(true){

	    int n = scan.nextInt();
	    int k = scan.nextInt();

	    if(n == 0 && k == 0){
		break;
	    }
	    
		int i = 0;
		int disp = 0;
		int check = 0;

		System.out.print("0.");

		while(true){

		    if(n+i < 10){
			System.out.print(n+i);
			disp++;
			
			if(disp == k) break;
		    }else{
			String data = String.valueOf(n+i);
			for(int j = 0; j < data.length(); j++){
			    System.out.print(data.charAt(j));
			    disp++;
			    if(disp == k){
				check = -1;
				break;
			    }
			}
		    }

		    if(check == -1){
			break;
		    }
		    
		    i++;
		}
		System.out.println();

	}
    }
}