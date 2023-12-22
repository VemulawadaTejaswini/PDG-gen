import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


class prime2{
	public static void main(String args[]){


		LinkedList<Integer> primes = new LinkedList<Integer>();
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();


		for(int i = 2; i <= n; i++){ //すべての数を格納
			numbers.add(i);
		}

		int prime = 0;
		Iterator<Integer> it;

		do{
			it = numbers.iterator();

			prime = numbers.getFirst(); //最初の文字を取る
			primes.add(prime);

			while(it.hasNext()){

				if(it.next() % prime == 0){
					it.remove();
				}
			}

		}while(numbers.getLast() > prime*prime);

		System.out.println(primes.size() + numbers.size());
	}
}