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
        int r = sc.nextInt();
        int s[][] = new int[r][2];
        for (int u=0; u < r; u++) {
            s[u][0] = sc.nextInt();
            s[u][1] = sc.nextInt();
        }
        sc.close();
        Dice2 dice = new Dice2(l, m, n, o, p, q);
        for (int u=0; u < r; u++) {
        	System.out.println(dice.search(s[u][0], s[u][1]));
        }
    }
}
    class Dice2{
		int one;
		int two;
		int three;
		int four;
		int five;
		int six;
		int tmp;
    	Dice2(int a, int b, int c, int d, int e, int f){
    		one=a;
    		two=b;
    		three=c;
    		four=d;
    		five=e;
    		six=f;
    	}
    	int search(int a, int b){//上面・前面の順
    		if(a==one) {
    			if(b==two){
    				return three;
    			} else if(b==three){
    				return five;
    			} else if(b==four){
    				return two;
    			} else if(b==five){
    				return four;
    			}
    		} else if(a==two) {
    			if(b==one){
    				return four;
    			} else if(b==three){
    				return one;
    			} else if(b==four){
    				return six;
    			} else if(b==six){
    				return three;
    			}
    		} else if(a==three) {
    			if(b==one){
    				return two;
    			} else if(b==two){
    				return six;
    			} else if(b==five){
    				return one;
    			} else if(b==six){
    				return five;
    			}
    		} else if(a==four) {
    			if(b==one){
    				return five;
    			} else if(b==two){
    				return one;
    			} else if(b==five){
    				return six;
    			} else if(b==six){
    				return two;
    			}
    		} else if(a==five) {
    			if(b==one){
    				return three;
    			} else if(b==three){
    				return six;
    			} else if(b==four){
    				return one;
    			} else if(b==six){
    				return four;
    			}
    		} else if(a==six) {
    			if(b==two){
    				return four;
    			} else if(b==three){
    				return two;
    			} else if(b==four){
    				return five;
    			} else if(b==five){
    				return three;
    			}
    		}
    		return 0;
    	}
    	void print(){
    		System.out.println(one);
    	}

    }

