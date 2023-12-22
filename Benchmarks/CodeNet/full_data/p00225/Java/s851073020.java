import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    String s;
    int[] words;
    int[][] w;
    boolean ans;
    boolean[] visit;
    int min = Integer.MIN_VALUE;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;

	    words = new int[26];
	    w = new int[26][26]; // start-end
	    visit = new boolean[26];
	    ans = true;

	    for(int i=0; i<n; i++){
		s = sc.next();
		char[] c = s.toCharArray();
		
		int start = c[0]+'0'-145;
		int end = c[c.length-1]+'0'-145;

		words[start]++;
		words[end]++;
		w[start][end]++;
		visit[start] = visit[end] = true;		
	    }
	 
	    // テヲツャツ。テヲツ閉ー-テ・ツ・ツ?ヲツ閉ーテ」ツ??テ、ツサツ・テ、ツクツ凝」ツ?ァテ」ツ?づ」ツつ凝」ツ?禿」ツ?ィテ」ツ??
	    int count = 0;
	    for(int i=0; i<26; i++)
		if(words[i]%2==1) count++;
	    if(count>2) ans = false;

	    /* 
	       テ」ツつーテ」ツδゥテ」ツδ陛」ツ??..テゥツ?」テァツオツ静」ツ?ァテ」ツ?づ」ツつ凝」ツ?禿」ツ?ィ...
	       2テヲツャツ。テ・ツ?εゥツ?催・ツ按療」ツ?ィbooleanテ」ツつ津、ツスツソテ」ツ?」テ」ツ?ヲテ」ツ?｜ooleanテゥツ?催・ツ按療」ツ?古・ツ?ィテ」ツ?ヲfalseテ」ツ?ォテ」ツ?ェテ」ツつ古」ツ?ーテゥツ?」テァツオツ静」ツ??
	    */
	    int a=0;
	    while(!visit[a]) a++; // テゥツ?ゥテ・ツスツ禿」ツ?ォテ」ツつケテ」ツつソテ」ツδシテ」ツδ暗・ツ慊ーテァツつケテヲツアツコテ」ツつ?」ツつ?
	    search(a);
	    boolean fal = false;
	    for(int i=0; i<26; i++)
		fal = fal || visit[i];
	    if(fal) ans = false;


	    //show();
	    System.out.println(ans ? "OK" : "NG");
	}
    }

    void search(int a){
	if(!visit[a]) return;
	visit[a] = false;
	for(int i=0; i<26; i++){
	    if(w[a][i]!=0) search(i);
	    if(w[i][a]!=0) search(i);
	}
    }

    void show(){
	for(int i=0; i<26; i++)
	    System.out.print(words[i]+" ");
	System.out.println();
	System.out.println("----------");
    }
}