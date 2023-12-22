import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        String command = sc.next();
        sc.close();
        Dice dice = new Dice(l, m, n, o, p, q);
        for (int s=0; s < command.length(); s++) {
        	String t = command.substring(s,s+1);
        	if("N".equals(t)){
        		dice.N();
        	} else if("E".equals(t)){
            	dice.E();
            } else if("W".equals(t)){
            	dice.W();
            } else if("S".equals(t)){
            	dice.S();
            }
        }
        dice.print();
    }
}
    class Dice{
		int one;
		int two;
		int three;
		int four;
		int five;
		int six;
		int tmp;
    	Dice(int a, int b, int c, int d, int e, int f){
    		one=a;
    		two=b;
    		three=c;
    		four=d;
    		five=e;
    		six=f;
    	}
    	void N(){//1-2-6-5
    		tmp =one;
    		one=two;
    		two=six;
    		six=five;
    		five=tmp;
    	}
    	void E(){//1-4-6-3
    		tmp =one;
    		one=four;
    		four=six;
    		six=three;
    		three=tmp;
    	}
    	void W(){//1-3-6-4
    		tmp =one;
    		one=three;
    		three=six;
    		six=four;
    		four=tmp;
    	}
    	void S(){//1-5-6-2
    		tmp =one;
    		one=five;
    		five=six;
    		six=two;
    		two=tmp;
    	}
    	void print(){
    		System.out.println(one);
    	}

    }

