import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = 0,maxPQ = 0;
	
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;
	    
	    boolean[] check = new boolean[n];

	    System.out.println(checkPrime(check));
	}
    }

    static int checkPrime(boolean[] check){ // テ・ツ崢崚」ツ?、テ・ツュツ静ァツエツ?ヲツ閉ーテ」ツつ津ィツソツ氾」ツ??
	
	for(int i = 1;i*i<check.length;i++){ // テ」ツ?敕」ツつ古」ツ?古ァツエツ?ヲツ閉ーテ」ツ??」ツ?」テ」ツ?淌」ツつ嘉」ツ?敕」ツ?ョテ・ツ?催ヲツ閉ーテ」ツつ断alseテ」ツ?ォテ」ツ?凖」ツつ?
	    if(!check[i]) notPrime(check,i+1);

	}

	for(int i = check.length-1;i>=0;i--){ // trueテ」ツつ津」ツ?ソテ」ツ?、テ」ツ?妥」ツ?淌」ツつ嘉」ツ?敕」ツ?ョテ、ツクツ凝」ツ?ィテ」ツ?凝」ツつづィツヲツ凝」ツ?ヲテ」ツ?｛kテ」ツ??」ツ?」テ」ツ?淌」ツつ嘉」ツ?敕」ツつ古」ツ?古ヲツ慊?・ツ、ツァテ」ツ?ョテヲツ閉ーテ」ツ??」ツ?療ィツソツ氾」ツ?療」ツ?。テ」ツつε」ツ??
	    if(!check[i] && !check[i-2] && !check[i-6] && !check[i-8]){
		return i+1;
	    }
	}

	return 0; // テ、ツサツョ
	
    }

    static void notPrime(boolean[] check,int n){ // テァツエツ?ヲツ閉ーテ」ツ??」ツ?」テ」ツ?淌ヲツ閉ーテ」ツ?ョテ・ツ?催ヲツ閉ーテ」ツつ稚rueテ」ツ?ォ
	for(int i = 2;i*n<check.length;i++){
	    check[(n*i)-1] = true;
	}
    }
}