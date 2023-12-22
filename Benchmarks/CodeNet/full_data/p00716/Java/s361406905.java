
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
//		System.out.println("START");
		
		Scanner scan = new Scanner(System.in);
		
		int dataSetNum = scan.nextInt();
		List<DataSet> dataSets = new ArrayList<DataSet>();
		
		for(int i = 0; i < dataSetNum; i++)
		{
			dataSets.add(new DataSet());
		}
		for(int i = 0; i < dataSetNum; i++)
		{
			System.out.println(dataSets.get(i).getAnswer());
		}

	}

	static class Method
	{
		Scanner scan = new Scanner(System.in);
		int type; //0 for tan, 1 for fuku/compound
		double interest;
		int cost;
		DataSet dataSet;
			
		public Method(DataSet dataSet)
		{
//			System.out.println("Constructing method");
			
			type = Integer.parseInt(scan.next());
			interest = Double.parseDouble(scan.next());
			cost = Integer.parseInt(scan.next());
			this.dataSet = dataSet;
			
//			System.out.println("Method constructed: type " + type + " interest " + interest + " cost " + cost);
		}
		
		public int calculate()
		{
			int money = dataSet.startingMoney;
			int celengan = 0;
			
			int curInterest;
			
			for(int year = 0; year < dataSet.years; year++)
			{
				curInterest =  (int)((float)money * interest);
				
				if(type == 0)
				{
					celengan += curInterest;
				}
				else if(type == 1)
				{
					money += curInterest;
				}
				
				money -= cost;
			}
			
			return (money + celengan);
		}
	}
	
	static class DataSet
	{
		Scanner scan = new Scanner(System.in);
		int startingMoney;
		int years;
		List<Method> methods = new ArrayList<Method>();
		int numOfMethods;
		
		int answer;
		
		public int getAnswer()
		{
			return answer;
		}

		public DataSet()
		{
			startingMoney = scan.nextInt();
			years = scan.nextInt();
			numOfMethods = scan.nextInt(); 
			
			int biggestMoneyYet = -999999999;
			for(int i = 0; i < numOfMethods; i++)
			{
				methods.add(new Method(this));
				
				int ret = methods.get(i).calculate();
				
				if(i == 0) {biggestMoneyYet = ret;}
				else
				{
					if(ret > biggestMoneyYet) {biggestMoneyYet = ret;}
				}
			}
			
			answer = biggestMoneyYet;
			//constructor
		}
	}
}
