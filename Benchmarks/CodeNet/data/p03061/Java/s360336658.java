import java.util.*;

public class Main {

    public static void main(String[] args) {
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int nmin = Integer.MAX_VALUE;

        int answer=0;

        //List<Integer> list1 = new ArrayList<>();
        //List<String> list2 = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
            if(min>A[i])
            {
                nmin=min;
                min=A[i];
            }
        }
        //System.out.println(min);
        //System.out.println(nmin);
        //System.out.println("*************");
        //System.out.println("------------");
        List<Integer> mink=new ArrayList<>();
        List<Integer> nmink=new ArrayList<>();
        for(int i=1;i<=min/2;i++)
        {
            if(min%i==0)
            {
                mink.add(i);
            }
        }
        mink.add(min);
        //System.out.println(Arrays.toString(mink.toArray()));
        //System.out.println("------------");
        for(int i=1;i<=nmin/2;i++)
        {
            if(nmin%i==0)
            {
                nmink.add(i);
            }
        }
        nmink.add(nmin);
        //System.out.println(Arrays.toString(nmink.toArray()));
        //System.out.println("------------");
        //処理
        int minM=0;
        int nminM=0;
        int aa=Integer.MAX_VALUE;
        int bb=Integer.MAX_VALUE;
        int amax=Integer.MIN_VALUE;
        int bmax=Integer.MIN_VALUE;
        if(N==2)
        {
            int x=A[0];
            int y=A[1];
            if(x<y)
            {
                int ads;
                ads=x;
                x=y;
                y=ads;
            }
            int rew;
            while((rew=x%y)!=0)
            {
                x=y;
                y=rew;
            }
            answer=y;
        }else if(N==3)
        {
            for (int i = 0; i < A.length; i++) {
                if (A[i] != min) {
                    aa = A[i];
                }
            }
            for (int i = 0; i < A.length; i++) {
                if (A[i] != min && A[i] != aa) {
                    bb = A[i];
                }
            }
            //System.out.println(aa);
            //System.out.println(bb);

            for (int i = 0; i < mink.size(); i++) {
                int cc = mink.get(i);
                if (aa % cc == 0) {
                    if (amax < cc) {
                        amax = cc;
                    }
                }
                //System.out.println(amax);
            }

            for (int i = 0; i < mink.size(); i++) {
                int cc = mink.get(i);
                if (bb % cc == 0) {
                    if (bmax < cc) {
                        bmax = cc;
                    }
                }
                //System.out.println(amax);
            }

            if (amax > bmax) {
                answer = amax;
            } else if (bmax > amax) {
                answer = bmax;
            } else {
                answer = amax;
            }
        } else if(N>=4)
        {
            for (int i = 0; i < A.length; i++) {
                if (A[i] != min && A[i] != nmin) {
                    aa = A[i];
                }
            }
            for (int i = 0; i < A.length; i++) {
                if (A[i] != min && A[i] != nmin && A[i] != aa) {
                    bb = A[i];
                }
            }

            //System.out.println(aa);
            //System.out.println(bb);

            for (int i = 0; i < mink.size(); i++) {
                int cc = mink.get(i);
                if (aa % cc == 0 && bb % cc == 0) {
                    if (amax < cc) {
                        amax = cc;
                    }
                }
                //System.out.println(amax);
            }
            //System.out.println("================");
            for (int i = 0; i < nmink.size(); i++) {
                int dd = nmink.get(i);
                if (aa % dd == 0 && bb % dd == 0) {
                    if (bmax < dd) {
                        bmax = dd;
                    }
                }
                //System.out.println(bmax);
            }

            if (amax > bmax) {
                answer = amax;
            } else if (bmax > amax) {
                answer = bmax;
            } else {
                answer = amax;
            }
        }
        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}