import java.util.Scanner;

public class Main {

	private static int[] ar = {1,0,0};

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

    	String[] s;
    	while(sc.hasNext()){
    		s = sc.next().split(",");
    		swap(s[0],s[1]);
    	}

    	System.out.println(get_place());
	}

    private static void swap(String a_str,String b_str){
    	int a   = chg(a_str);
    	int b   = chg(b_str);
    	ar[b]   = ar[a] - ar[b];
    	ar[a]  -= ar[b];
    	ar[b]  += ar[a];
    }

    private static int chg(String s){
    	int ret = -1;
    	if(s.equals("A")){ret = 0;}
    	if(s.equals("B")){ret = 1;}
    	if(s.equals("C")){ret = 2;}
    	return ret;
    }

    private static char get_place(){
    	char ret = 'Z';
    	for(int i=0;i<ar.length;i++){
    		if(ar[i] == 1){
    			switch (i){
    				case 0: ret = 'A';
    				        break;
    				case 1: ret = 'B';
    				        break;
    				case 2: ret = 'C';
    			}
    		}
    	}
    	return ret;
    }
}