import java.lang.reflect.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long Q = sc.nextInt();
		sc.nextLine();
		String S = sc.next();
		List<Question> qList = new ArrayList();
		for(int i=0; i<Q; i++){
			qList.add(new Question(sc.nextInt(), sc.nextInt()));
		}

		List<Integer> acList = new ArrayList<>();
		String tmpS = new String(S);
		while(true){
			int acIndex = tmpS.indexOf("AC");
			if(acIndex >= 0){
				if(acList.size()>0){
					acList.add(acIndex + acList.get(acList.size()-1)+2);
				}else{
					acList.add(acIndex);
				}

				tmpS = tmpS.substring(tmpS.indexOf("AC")+2);
			} else{
				break;
			}
		}

		List<Integer> countList = new ArrayList<>();
		countList.add(0);
		int tmpCount = 0;
		for(int i=0; i<acList.size() ;i++){
			int startIndex = 0;
			if(i>0){
				startIndex= acList.get(i-1);
			}

			for(int j=startIndex; j<acList.get(i); j++){
				countList.add(tmpCount);
			}
			tmpCount++;
		}

		int lastCount = countList.get(countList.size()-1)+1;
		for(int i=countList.size(); i<S.length(); i++){
			countList.add(lastCount);
		}


		for(Question q : qList){
			int ans = 0;
			int startCount = countList.get(q.l-1);
			int endCount = countList.get(q.r-1);
			System.out.println(endCount-startCount);
		}


	}

}

class Question {

	Question(int l, int r){
		this.l = l;
		this.r = r;
	}
	int l;
	int r;
}