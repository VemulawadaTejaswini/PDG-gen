import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static class MyString implements Comparable<MyString>{
		String str;
		int index;
		String order;
		MyString(String str, int index, String order){
			this.str = str;
			this.index = index;
			this.order = order;
		}
		@Override
		public int compareTo(MyString o) {
			char[] value = str.toCharArray();
			int len1 = value.length;
	        int len2 = o.order.toCharArray().length;
	        int lim = Math.min(len1, len2);
	        char v1[] = value;
	        char v2[] = o.order.toCharArray();

	        int k = 0;
	        char[] ord = order.toCharArray();
			while (k < lim) {
	            char c1 = v1[k];
	            char c2 = v2[k];
	            if (c1 != c2) {
	                return indexOf(ord, c1) - indexOf(ord, c2);
	            }
	            k++;
	        }
	        return len1 - len2;
		}
		private int indexOf(char[] array, char ch){
			for(int i = 0; i < array.length; ++i)
				if(ch == array[i])
					return i;
			return Integer.MAX_VALUE;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; ++i)
			str[i] = scanner.next();
		int q = scanner.nextInt();
		outer:
		for(int i = 0; i < q; ++i){
			MyString[] ms = new MyString[n];
			int index = scanner.nextInt();
			String ord = scanner.next();
			for(int j = 0; j < n; ++j){
				ms[j] = new MyString(str[j], j, ord);
			}
			Arrays.sort(ms);
			for(int j = 0; j < ms.length; ++j){
				if(ms[j].index+1 == index){
					System.out.println(j+1);
					continue outer;
				}
			}
		}
		
		scanner.close();
	}

}
