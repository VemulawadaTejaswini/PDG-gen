import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//�C���X�^���X�E��`�E����
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();
		long[] a=new long[n];
		long[] b=new long[m];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextLong();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=s.nextLong();
		}
		int cnt=0;
		long sum=0;
		int an=0;
		int bm=0;
		
		/*
		A��B�̊��̈�ԏ�̖{�ɂ����鎞�Ԃ��r�����Ȃ����̖{��ǂݐ����J�E���g�A�b�v
		�ǂ񂾕��̔Ԓn��1�i�߂�B
		�ǂ񂾎��Ԃ̍��v��K���𒴂��閔�͖{�����ɂȂ��Ȃ�����I��
		�I����ɍŌ�̖{��ǂݏI�������v���Ԃ�K���𒴂��Ă�����ǂ񂾍�����-1����
		*/
		
		while(sum<=k && (an<n || bm<m))
		{
			if(an<n && bm<m)//�ǂ�����܂��{������
			{
				if(a[an]>b[bm])//A�̕���B��莞�Ԃ�����
				{
					sum+=b[bm];
					cnt++;
					bm++;
				}
				else
				{
					sum+=a[an];
					cnt++;
					an++;
				}
			}
			else if(an<n)//B�̖{���Ȃ��Ȃ���
			{
				sum+=a[an];
				cnt++;
				an++;
			}
			else//A�̖{���Ȃ��Ȃ���
			{
				sum+=b[bm];
				cnt++;
				bm++;
			}
		}
		if(sum>k)
		{
			cnt--;
		}
		System.out.println(cnt);
		s.close();
	}
}
