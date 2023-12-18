import java.util.Arrays;
import java.util.Scanner;


class ABC implements Comparable<ABC>{
	int a;
	int b;

	public ABC(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int compareTo(ABC abc) {
		//降順なら上１，下−１
        //昇順なら上−１，下１
        if (this.b < abc.b) return -1;
        if (this.b > abc.b) return 1;
        return 0;
	}


}


public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		ABC [] abc = new ABC[n];

		for(int i = 0; i < n; i++) {
			abc[i] = new ABC(stdIn.nextInt(),stdIn.nextInt());
		}

		Arrays.sort(abc);

		
		long cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(cnt + abc[i].a <= abc[i].b) {
				cnt += abc[i].a;
				continue;
			}else {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");



	}

}

/*
class Pair implements Comparable<Pair>{
    //firstが検索対象
    public int first;
    public int second;
    Pair(int a, int b) {
        this.first = a;
        this.second = b;
    }

    public int compareTo(Pair pair) {
        //降順なら上１，下−１
        //昇順なら上−１，下１
        if (this.first < pair.first) return 1;
        if (this.first > pair.first) return -1;
        return 0;
    }
}


*/