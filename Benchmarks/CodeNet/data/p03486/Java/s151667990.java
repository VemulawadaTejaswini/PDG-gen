import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();
	String t = scan.next();
	char[] cs = s.toCharArray();
	char[] ct = t.toCharArray();
	int flag = 1;
	int N = 0;

	for(int i = 0; i < cs.length-1;i++){
	    for(int j = i; j < cs.length; j++){
		if(cs[i] > cs[j]){
		    
		    char tmp = cs[i];
		    cs[i] = cs[j];
		    cs[j] = tmp;

		}
	    }
	}

	for(int i = 0; i < ct.length-1;i++){
	    for(int j = i; j < ct.length; j++){
		if(ct[i] < ct[j]){
		    
		    char tmp = ct[i];
		    ct[i] = ct[j];
		    ct[j] = tmp;
		    
		}
	    }
	}	

	int N1 = 0;
	int N2 = 0;
	
	if(cs.length < ct.length || cs.length == ct.length){
	    N = N1 = cs.length;
	}else{
	    N = N2 = ct.length;
	}

	for(int i = 0; i < N; i++){

	    if(cs[i] > ct[i]){
		flag = 0;
		break;
	    }else if(cs[i] < ct[i]){
		flag = 1;
		break;
	    }
	    if(i == N1){
		flag = 1;
		break;
	    }
	    if(i == N2){
		flag = 0;
		break;
	    }
	}
		
	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
