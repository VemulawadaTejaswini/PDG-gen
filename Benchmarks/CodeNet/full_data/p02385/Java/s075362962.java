import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int o1 = sc.nextInt();
        int p1 = sc.nextInt();
        int q1 = sc.nextInt();
        int l2 = sc.nextInt();
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int o2 = sc.nextInt();
        int p2 = sc.nextInt();
        int q2 = sc.nextInt();
        sc.close();
        Dice3 dice1 = new Dice3(l1, m1, n1, o1, p1, q1);
        Dice3 dice2 = new Dice3(l2, m2, n2, o2, p2, q2);
        final String order = "NNNNWNNNWNNNENNNENNNWNNNWNNNWNNNENNNENNNWNNN";
        //topがあったときのフラグ
        boolean flg = false;
        //order 回して合ってるか確認する。
        for(int r=0;r < order.length(); r++){
        	if (dice1.equals(dice2)) {
        		flg = true;
        		break;
        	}
        	String odr = order.substring(r, r+1);
        	if ("N".equals(odr)){
        		dice1.N();
        	} else if ("E".equals(odr)) {
        		dice1.E();
        	} else if ("W".equals(odr)) {
        		dice1.W();
    		} else if ("S".equals(odr)) {
        		dice1.S();
			}
        }
        if(flg) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}
    class Dice3{
		int one;
		int two;
		int three;
		int four;
		int five;
		int six;
		int tmp;
    	Dice3(int a, int b, int c, int d, int e, int f){
    		one=a;
    		two=b;
    		three=c;
    		four=d;
    		five=e;
    		six=f;
    	}
    	boolean equals(Dice3 b) {
    		if ((this.one==b.one)&&(this.two==b.two)&&(this.three==b.three)&&(this.four==b.four)&&(this.five==b.five)&&(this.six==b.six)){
    			return true;
    		}
    		return false;
    	}
       	void N(){//1-2-6-5
    		tmp =this.one;
    		one=this.two;
    		two=this.six;
    		six=this.five;
    		five=tmp;
    	}
    	void E(){//1-4-6-3
    		tmp =this.one;
    		one=this.four;
    		four=this.six;
    		six=this.three;
    		three=this.tmp;
    	}
    	void W(){//1-3-6-4
    		tmp =this.one;
    		one=this.three;
    		three=this.six;
    		six=this.four;
    		four=tmp;
    	}
    	void S(){//1-5-6-2
    		tmp =this.one;
    		one=this.five;
    		five=this.six;
    		six=this.two;
    		two=tmp;
    	}
    	void turnR(){
    		tmp=this.two;
    		two=this.three;
    		three=this.five;
    		five=this.four;
    		four=tmp;
    	}
    	void print(){
    		System.out.printf("%d %d %d %d %d %d %n", one,two,three,four,five,six);
    	}
    }

