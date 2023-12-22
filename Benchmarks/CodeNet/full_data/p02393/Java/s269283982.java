import java.util.*;

class Main{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	Map<Integer>list = new SetMap<>();
	for(int i = 0; i < 3; i++){
		list.add(sc.nextInt());
	}
		for(int j = 0; j < 3; j++)
			if(j == 2)
			System.out.print(list.iterator());
			else
			System.out.print(list.iterator() + " ")
		}
	}
}