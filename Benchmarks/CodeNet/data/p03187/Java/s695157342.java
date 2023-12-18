    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		long l = sc.nextLong();
		int n = sc.nextInt();
		ArrayList<Long> x = new ArrayList<>();
		for(int i = 1; i <= n; i++){
		    x.add(sc.nextLong());
		}
		Collections.sort(x);
		
    		// 出力
		System.out.println(burn(x, l, 0, n-1, 0));
    	}

	private static long burn(ArrayList<Long> x1, long l1, int imin, int imax, long now){
	    if(imin == imax){
		long a = Math.abs(x1.get(imin) - now);
		if(a > l1 /2){
		    return a;
		}else{
		    return l1 - a;
		}
	    }else{
		long a = x1.get(imin) - now;
		if(a < 0){
		    a += l1;
		}
		long right = a + burn(x1, l1, imin+1, imax, x1.get(imin));

		a = now - x1.get(imax);
		if(a < 0){
		    a += l1;
		}
		long left = a + burn(x1, l1, imin, imax-1, x1.get(imax));

		if(right > left){
		    return right;
		}else{
		    return left;
		}
	    }
	}
    }
