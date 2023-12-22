
/*
 
 Main
 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    
    int T;
    int[] card = new int[9];
    
    public void Main()
    {
        
    }
    
    private boolean isGoodSet(int a, int b, int c)
    {
        return isSameNumber(a, b, c) || isSequence(a, b, c);
    }
    
    private boolean isSameNumber(int a, int b, int c)
    {
        return a == b && b == c;
    }
    
    private boolean isSequence(int a, int b, int c)
    {
        return (a+2) == (b+1) && (b+1) == c;
    }
    
    private boolean isAllGoodSet()
    {
        return
        (
            isGoodSet(card[0], card[1], card[2])
            && isGoodSet(card[3], card[4], card[5])
            && isGoodSet(card[6], card[7], card[8])
        );
    }
    
    int win()
    {
        Arrays.sort(card);
        
        do
        {
            if( isAllGoodSet() ) { return 1; }
            
        } while (next_permutation(card));
        
        return 0;
    }
    
    public boolean next_permutation(int A[])
    {
        int first = 0;
        int last = A.length;
        
        if (first == last)
        {
            return false;
        }
        
        int i = first;
        ++i;
        
        if (i == last)
        {
            return false;
        }
        
        i = last;
        --i;
        
        for(;;)
        {
            int ii = i;
            --i;
            
            if (A[i] < A[ii])
            {
                int j = last;
                while (!(A[i] < A[--j])){}
                swap(A, i, j);
                reverse(A, ii, last);
                return true;
            }
            if (i == first)
            {
                reverse(A, first, last);
                return false;
            }
        }
    }
    
    private void swap(int A[], int a, int b)
    {
        int buff;
        buff=A[a];
        A[a]=A[b];
        A[b]=buff;
    }
    
    private void reverse(int A[] ,int first, int last)
    {
        while(first < --last)
        {
            swap(A, first, last);
            first++;
        }
    }
    
    public static void main(String[] args)
    {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        for (int t=0; t<T; ++t)
        {
            for (int i=0; i<9; ++i)
            {
                main.card[i] = scan.nextInt();
            }

            
            String color;
            for (int i=0; i<9; ++i)
            {
                color = scan.next();
                if (color.equals("G")) { main.card[i] += 10; }
                else if (color.equals("B")) { main.card[i] += 20; }
            }
            
            int ans = main.win();
            System.out.println(ans);
        
        }
    }
    
}