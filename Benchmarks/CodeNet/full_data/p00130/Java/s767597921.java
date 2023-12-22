import java.util.Scanner;

public class Main {

	private static final int    MAX   = 100;
	private static       char[] train,
	                            round;
	private static       int    p     = 0;

	public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	p = 0;
        	train = new char[MAX];
    		for(int i=0;i<MAX;i++){train[i] = 'E';}
        	round = sc.nextLine().toCharArray();
        	train[0] = round[0];
        	for(int i=1;i<round.length;i++){
        		switch (round[i]){
        		 	case '<':{p=cp(p-1); break;}
        		 	case '-':{p=cp(p+1);       }
        		 }
        		 regist(i+=2,p);
        	 }
             print();
        }
	}

	private static int cp(int i){return (i + MAX) % MAX;}

	private static void regist(int i,int p){

		 if(train[p] == 'E'){
			 train[p] = round[i];
		 }
	}

	private static void print(){

		while(true){
			if(train[p] == 'E'){
				p = cp(p + 1);
				break;
			}
			p = cp(--p);
		}

		char[] out = new char[MAX];
		for(int i=0;train[p] != 'E';i++){
			out[i] = train[p];
			p = cp(++p);
		}
		System.out.println(String.valueOf(out));
	}
}