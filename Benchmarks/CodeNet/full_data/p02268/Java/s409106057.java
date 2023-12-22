import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
        int n = sc.nextInt();
        String SStr = sc.next();
        int q = sc.nextInt();
        String TStr = sc.next();

        int[] S = toIntAry(SStr, n);
        int[] T = toIntAry(TStr, q);

        int cnt=0;
        for(int i=0; i<q; i++){
        	int key = T[i];
        	if(binarySearch(S,key,n))cnt++;
        }

        System.out.println(cnt);

	}





	private static boolean binarySearch(int[] s, int key, int n) {
		int left = 0;
		int right = n;
		while(left<right){
			int mid = (left+right)/2;
			if(s[mid]==key){
				return true;
			}else if(s[mid] > key){
				right = mid;
			}else{
				left = mid +1;
			}
		}

		return false;
	}





	private static int[] toIntAry(String str, int n) {
        String[] tmp = str.split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(tmp[i]);
		}
        return A;
	}


}