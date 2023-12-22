import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int[] hindo = new int[100];
	while(sc.hasNext()){
	    int num = sc.nextInt();
	    hindo[num]++;
	}

	//ツ出ツ個サツ嘉アツ青板づ個催妥・ツ値ツづーツ仰づ淞づゥ
	int max = 0;
	for(int i=0; i<hindo.length; i++){
	    if(hindo[i]>max){max = hindo[i];}
	}

	for(int i=0; i<hindo.length; i++){
	    if(hindo[i]==max){
		System.out.println(i);
	    }
	}
    }
}