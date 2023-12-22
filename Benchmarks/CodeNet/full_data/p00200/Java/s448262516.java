import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Map<String, Station> stationList = new HashMap<String, Station>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		for (int i = 0; i < n; ++i) {
			String stNo = sc.next();
			String dist = sc.next();
			String cost = sc.next();
			String time = sc.next();
			addRoute(stationList,stNo, dist, cost, time);
			addRoute(stationList,dist, stNo, cost, time);
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; ++i) {
			String start = sc.next();
			String goal = sc.next();
			String val = sc.next();
			System.out.println(calc(stationList, start, goal, val));
		}
	}

	public static void addRoute(Map<String,Station> stationList, String stNo, String dist, String cost, String time) {
		if (stationList.containsKey(stNo)) {
			stationList.get(stNo).addRoute(dist, cost, time);
		} else {
			Station st = new Station(stNo);
			stationList.put(stNo, st);
			stationList.get(stNo).addRoute(dist, cost, time);
		}
	}

	public static String calc(Map<String,Station> stationList, String start, String goal, String val) {
		RouteSearch rs = new RouteSearch(stationList);
		if (val.equals("0")) {
			val = "cost";
		} else {
			val = "time";
		}	
		return calc(rs,start,goal,val,"", 0);
	}

	public static String calc(Main.RouteSearch rs, String stname, String goal, String val, String preroute, int precost) {
		
//		Map<String,Object> thisStation = rs.getMap(stname);
		rs.removeRoute(stname);
		
		String thisroute = preroute+","+stname;
		int cost = precost;
		
		
		List<Map<String, String>> route = ((Station)rs.getMap(stname).get("st")).getRoute();
		for (Map<String, String> map : route) {
			if (!(Boolean)rs.getValue(map.get("dist"), "def")) {
				
				int rcost = cost + (Integer.parseInt(map.get(val)));
				if (rs.insert(map.get("dist"), rcost)) {
					rs.set(map.get("dist"), "mincost", rcost);
					rs.set(map.get("dist"), "minroute", thisroute);
				}
			}
		}
		
		if (rs.hasNext()) {
			return calc(rs, rs.next(), goal, val, thisroute,((Integer)rs.getValue(rs.next(), "mincost")).intValue());
		} else {
			return ""+rs.getMap(goal).get("mincost");
		}
	}
	
	// 
	static class RouteSearch {
		
		private List<String> list;
		private Map<String,Map<String,Object>> state;
		
		public RouteSearch(Map<String,Main.Station> stationlist) {
			// TODO Auto-generated constructor stub
			list = new ArrayList<String>();
			state = new HashMap<String,Map<String,Object>>();
			for (Entry<String, Station> st : stationlist.entrySet()) {
				Station stclone = new Station(st.getValue());
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("name", stclone.getName());
				map.put("mincost", 0);
				map.put("minroute", "");
				map.put("def", false);
				map.put("st", stclone);
				state.put(stclone.getName(), map);
			}
		}
		
		public void set (String stname, String key, Object value) {
			state.get(stname).put(key, value);
		}
		
		public Object getValue (String stname, String key) {
			return state.get(stname).get(key);
		}
		
		public Map<String,Object> getMap (String stname) {
			return state.get(stname);
		}
		
		public String next() {
			if (0<list.size()) {
				return list.get(0);
			} else {
				return null;
			}
		}
		
		public boolean hasNext() {
			if (0<list.size()) {
				return true;
			} else {
				return false;
			}
		}
		
		public void removeRoute (String stname) {
			for (Entry<String,Map<String,Object>> map : state.entrySet()) {
				((Station)map.getValue().get("st")).removeRoute(stname);
			}
			list.remove(stname);
		}

		public  boolean insert (String stname, int min) {
			Map<String,Object> map = state.get(stname);
			if (min > ((Integer) state.get(stname).get("mincost") ).intValue()
					&& ((Integer) state.get(stname).get("mincost")).intValue() != 0) {
				return false;
			}
			list.remove(stname);
			for (int i = 0; i < list.size(); ++i) {
				if (map.get("def").equals("true")) {
					list.add(i,stname);
					return true;
				} else if (min < ((Integer) state.get(list.get(i)).get("mincost")).intValue()
							|| ((Integer) state.get(list.get(i)).get("mincost")).intValue() == 0) {
					list.add(i,stname);
					return true;
				}
			}
			list.add((String)map.get("name"));
			return true;
		}
	}
	
	
	
	// Station Class
	static class Station implements Cloneable {

		private List<Map<String, String>> routeList = new ArrayList<Map<String, String>>();
		private String stationName;

		public Station(String name) {
			stationName = String.valueOf(name);
		}
		
		public Station (Station st) {
			stationName = new String(st.stationName);
			for (Map<String,String> map : st.routeList) {
				routeList.add(new HashMap<String,String>(map));
			}
		}

		public void addRoute(String dist, String cost, String time) {
			Map<String, String> route = new HashMap<String, String>();
			route.put("dist", dist);
			route.put("cost", cost);
			route.put("time", time);
			// add route list
			routeList.add(route);
		}

		public boolean removeRoute(String dist) {
			for (Map<String, String> map : routeList) {
				if (map.get("dist").equals(dist)) {
					routeList.remove(map);
					return true;
				}
			}
			return false;
		}

		public List<Map<String, String>> getRoute() {
			return routeList;
		}

		public String getName() {
			return stationName;
		}

		@Override
		public Object clone() {
			try {
				return super.clone();
			} catch (Throwable th) {
				throw new InternalError(th.toString());
			}
		}

	}

}