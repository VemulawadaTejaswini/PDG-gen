import java.util.Scanner;

class Main{

    public static void main(String[] args){
	int n,m,ok=1,cou=0;
	String s;
	

	Scanner nariyoshitool = new Scanner(System.in);

	while(true){
	n = nariyoshitool.nextInt();
	if(n == 0)break;
	m = nariyoshitool.nextInt();
	if(m == 0){}
	s = nariyoshitool.next();
	char c[] = s.toCharArray();
	//	System.out.println(c[12]);      

	for(int i=0;i<s.length()-(3+(2*(n-1)));i++){
	    if(c[i] == 'I'){
		for(int j=0;j<3+(2*(n-1));j++){
		    // if(j == 0) System.out.println("DEBUG ");
		    if(j%2 == 0){
			//	System.out.print(c[i+j]);
			if(c[i+j] != 'I')ok=0;
		    }else{
			//	System.out.print(c[i+j]);
			if(c[i+j] != 'O')ok=0;
		    }
		  
		}
		if(ok == 1)cou++;
		    ok=1;
		    //  System.out.println(" ");

	    }

	}
	System.out.println(cou);
	cou=0;


	}




    }

}