import java.util.Scanner;

public class Main{
  static int A,B,Q;
  static Long[] S,T,X;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    Q = sc.nextInt();
    S = new Long[A+2];
    T = new Long[B+2];
    X = new Long[Q];
    for(int i=1;i<=A;i++){
      S[i]=sc.nextLong();
    }
    S[0]=-100000000000000000L;
    S[A + 1]=100000000000000000L;
    for(int i=1;i<=B;i++){
      T[i]=sc.nextLong();
    }
    T[0]=-100000000000000000L;
    T[B + 1]=100000000000000000L;
    for(int i=0;i<Q;i++){
      X[i]=sc.nextLong();
    }
    for(int i=0;i<Q;i++){
      System.out.println(Qanswer(i));
    }
  }



  static int binary_search(Long[] Array,Long key,int r,int l){
    int mid = 0;
    if(l-r<=1){
      if(Math.abs(key-Array[r])>=Math.abs(key-Array[l])){
        return l;
      }
      else{
        return r;
      }
      //return Math.min(Math.abs(key-Array[r]),Math.abs(key-Array[l]));
    }
    else{
      if(Math.abs(r-l)%2==0){
        mid = (r+l)/2;
      }
      else{
        mid = (r+l)/2+1;
      }
      if(Array[mid]<=key){
        return binary_search(Array,key,mid,l);
      }
      else{
        return binary_search(Array,key,r,mid-1);
      }
    }
  }

  static Long Qanswer(int i){
    int Snear = binary_search(S,X[i],0,S.length-1);
    int Tnear = binary_search(T,X[i],0,T.length-1);

    /* ======== DEBUG ======== */
    //System.out.println("[" + S[Snear] + ", " + X[i] + ", " + S[Snear + 1] + "]");
    //System.out.println("[" + T[Tnear] + ", " + X[i] + ", " + T[Tnear + 1] + "]");
    /* ======== /DEBUG ======== */

    return minimum(caliculate(i,Snear,Tnear),caliculate(i,Snear,Tnear+1),caliculate(i,Snear+1,Tnear),caliculate(i,Snear+1,Tnear+1));
    /*if((Snear<=X[i] && Tnear<=X[i]) || (Snear>=X[i] && Tnear>=X[i])){
      return Math.max(Math.abs(X[i]-Snear),Math.abs(X[i]-Tnear));
    }
    else{
    return Math.max(Math.abs(X[i]-Snear),Math.abs(X[i]-Tnear))+2*Math.min(Math.abs(X[i]-Snear),Math.abs(X[i]-Tnear));
    }
    */
  }

  static Long caliculate(int i,int r,int l){
    if((S[r]<=X[i] && T[l]<=X[i]) || (S[r]>=X[i] && T[l]>=X[i])){
      /* ======== DEBUG ======== */
      //System.out.println("1: " + Math.abs(X[i] - S[r]) + ", " + Math.abs(X[i] - T[l]));
      //return Math.max(Math.abs(X[i]-S[r]),Math.abs(X[i]-T[l]));
      /* ======== /DEBUG ======== */
    }
    else{
      /* ======== DEBUG ======== */
      //Long t = Math.max(Math.abs(X[i]-S[r]),Math.abs(X[i]-T[l])) + 2*Math.min(Math.abs(X[i]-S[r]),Math.abs(X[i]-T[l]));
      //System.out.println("2: " + t);
      /* ======== /DEBUG ======== */
      return Math.max(Math.abs(X[i]-S[r]),Math.abs(X[i]-T[l]))+2*Math.min(Math.abs(X[i]-S[r]),Math.abs(X[i]-T[l]));
    }
  }

  static Long minimum(Long a,Long b,Long c,Long d){
    Long ans = 100000000000000000L;
    Long[] Arra= new Long[4];
    Arra[0] = a;
    Arra[1] = b;
    Arra[2] = c;
    Arra[3] = d;
    for(int i=0;i<4;i++){
      if(ans>=Arra[i]){
        ans = Arra[i];
      }
    }
    return ans;
  }

}