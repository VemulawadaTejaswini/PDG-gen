import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		List<Integer> x =new ArrayList<Integer>();
		String str=new String();
		int[] a = new int[26];
		String[] eng = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n"
				      ,"o","p","q","r","s","t","u","v","w","x","y","z"};
		do{
			str = scan.next();
			for(int i=0;i<str.length() ;i++){
				for(int j = 0 ; j < eng.length ;j++ ){
					if( eng[j].equalsIgnoreCase(String.valueOf(str.charAt(i)))){
						a[j]++;
					}
				}

			}
		}while(scan.hasNext());


		
		for(int j = 0 ; j < eng.length ;j++ ){
			System.out.println(eng[j]+" : "+a[j]);
			}

	}
}







//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		List<Integer> n = new ArrayList<Integer>();
//		List<Integer> x = new ArrayList<Integer>();
//		List<Integer> count = new ArrayList<Integer>();
//
//		 for(int i=0;;i++){
//			 n.add(i, scan.nextInt());
//			 x.add(i, scan.nextInt());
//			 count.add(i, 0);
//			 if(n.get(i)==0 && x.get(i)==0) break;
//		 }
//
//
//
//   for(int h=0;;h++){
//		 if(n.get(h)==0 && x.get(h)==0) break;
//		 for(int i=1;i<=n.get(h);i++){
//			 for(int j=i;j<=n.get(h);j++){
//				 if(i==j)continue;
//				 for(int k=j;k <= n.get(h);k++){
//					 if(i==k || j==k)continue;
//					 if(i+j+k == x.get(h)) count.set(h, count.get(h)+1 );
//				 }
//			 }
//		 }
//
//			System.out.println(count.get(h));
//   }
//	}
//
//}
//
//