import java.util.Scanner;
class Main {
  public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 0;
		String meirei;
		int[] list = new int[0];

		int i;
		for(i = 0; i < n; i++){
			meirei = scan.next();

			if(meirei.equals("deleteFirst")){
				list = deleteFirst(list);
			}else if(meirei.equals("deleteLast")){
				list = deleteLast(list);
			}else if(meirei.equals("insert") || meirei.equals("delete")){
				m = scan.nextInt();
				if(meirei.equals("insert")){
					list = insert(list, m);
				}else{
					for(int h = list.length - 1; h  >= 0; h--){
						if(m == list[h]){
							list = delete(list, h+1, list.length - 1);
							break;
						}
					}
				}
			}
		}

		for(i = list.length - 1; i >= 0; i--)
		{
			System.out.print(list[i]);
			if(i != 0)
			{
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
	}
	
	static int[] insert(int[] val, int m){
		int[] tmp = new int[val.length + 1];
		System.arraycopy(val, 0, tmp, 0, val.length);
		tmp[tmp.length - 1] = m;
		
		return tmp;
	}
	
	static int[] delete(int[] val, int start, int last){
		int[] tmp = new int[val.length - 1];
		
		while(start <= last){
			val[start - 1] = val[start];
			start++;
		}
		System.arraycopy(val, 0, tmp, 0, val.length - 1);
		
		return tmp; 
	}
	
	static int[] deleteFirst(int[] val){
		int[] tmp = new int[val.length - 1];
		System.arraycopy(val, 0, tmp, 0, val.length - 1);
		return tmp;
	}
	
	static int[] deleteLast(int[] val){
		int[] tmp = new int[val.length - 1];
		System.arraycopy(val, 1, tmp, 0, val.length - 1);
		return tmp;
	}
}