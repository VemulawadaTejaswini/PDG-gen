import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    for(int i=0;i<n;i++) a[i] = sc.nextInt();
    for(int i=0;i<n;i++) b[i] = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0);
    for(int i=1;i<n;i++){
      for(int j=0;j<list.size()+1;j++){
        if(j==list.size()){
          list.add(i);
          break;
        }else if(b[i]>b[list.get(j)]){
          list.add(j,i);
          break;
        }
      }
    }
    int count = 0;
    while(list.size()!=0){
      int num = list.get(0);
      list.remove(0);
      if(num==0){
        b[0] -= b[n-1]+b[1];
      }else if(num==n-1){
        b[n-1] -= b[n-2]+b[0];
      }else{
        b[num] -= b[num-1]+b[num+1];
      }
      if(a[num]>b[num]){count=-1;break;}
      if(a[num]!=b[num]){
        for(int i=0;i<list.size()+1;i++){
          if(i==list.size()){
            list.add(num);
            break;
          }else{
            if(b[num]>b[list.get(i)]){
              list.add(i,num);
              break;
            }
          }
        }
      }
      count++;
    }
    System.out.println(count);
  }
}

